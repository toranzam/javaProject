package com.spring_boot_jpa_product.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring_boot_jpa_product.project.dto.ProductDTO;
import com.spring_boot_jpa_product.project.entity.ProductEntity;

// DTO <-> ENTITY 변환 
// 				DTO <-> ENTITY
// 컨트롤러 -> 서비스 -> DataHandle서비스 -> DAO -> REPO -> DB
// 컨트롤러 <- 서비스 <- DataHandle서비스 <- DAO <- REPO <- DB

@Service
public class ProductService implements IProductService{
	
	private final ProductServiceDataHandle productServiceDataHandle;
	
	public ProductService(ProductServiceDataHandle productServiceDataHandle) {
		this.productServiceDataHandle = productServiceDataHandle;
	}

	// DataHandle 서비스에서 entity 타입으로 반환 
	@Override
	public ArrayList<ProductDTO> listAllProduct() {
		ArrayList<ProductEntity> entityList = productServiceDataHandle.listAllProduct(); // db rs 저장되어 있음
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		
		// entityList에 저장되어있는 레코드(entity)를 dto로 변환해서 list에 변환
		for(ProductEntity entity :  entityList) {
			ProductDTO dto = ProductDTO.toDto(entity);
			list.add(dto);
		}
		return list;
	}

	@Override
	public void insertProduct(ProductDTO dto) {
		ProductEntity e = ProductEntity.toEntity(dto);
		productServiceDataHandle.insertProduct(e);
	}

	// entity <-> dto 변환 코드 활용해서 dataHandle 서비스의 메소드 호출코드
	@Override
	public void updateProduct(ProductDTO dto) {
		ProductEntity entity = ProductEntity.toEntity(dto);
		productServiceDataHandle.updateProduct(entity);
	}

	@Override
	public void deleteProduct(String prdNo) {
		productServiceDataHandle.deleteProduct(prdNo);
	}

	@Override
	public ProductDTO detailViewProduct(String prdNo) {
		Optional<ProductEntity> entity= productServiceDataHandle.detailViewProduct(prdNo);
		return ProductDTO.toDto(entity.get());
	}

	@Override
	public String prdNoCheck(String prdNo) {
		return productServiceDataHandle.prdNoCheck(prdNo);		
	}

	@Override
	public List<ProductDTO> productSearch(HashMap<String, Object> map) {
		List<ProductEntity> entityList = productServiceDataHandle.productSearch(map);
		ArrayList<ProductDTO> productDtoList = new ArrayList<>();
		
		for(ProductEntity entity : entityList) {
			productDtoList.add(ProductDTO.toDto(entity));
		}
		
		return productDtoList;
	}
	

}
