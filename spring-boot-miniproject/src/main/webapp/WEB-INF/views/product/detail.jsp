<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>상품 상세 | PC PICK</title>
<link rel="stylesheet" href="<c:url value='/css/basic.css'/>">
<link rel="stylesheet" href="<c:url value='/css/common.css'/>">
<link rel="stylesheet" href="<c:url value='/css/product-detail.css'/>">
<script src="<c:url value='/js/product-detail.js'/>" defer></script>
</head>
<body>
	<%@ include file="../common/header.jsp"%>

	<main class="product-page">
		<div class="product-layout">
			<div class="product-content">
				<section class="product-gallery" aria-label="상품 이미지">
					<img class="product-gallery-image"
						src="<c:url value='/img/card.jpg'/>" alt="그래픽카드 제품 이미지">
				</section>

				<div class="product-tabs" role="tablist" aria-label="상품 상세 메뉴">
					<button class="product-tab is-active" id="product-info-tab"
						type="button" role="tab" aria-selected="true"
						aria-controls="product-info-panel">상품정보</button>
					<button class="product-tab" id="product-reviews-tab" type="button"
						role="tab" aria-selected="false" tabindex="-1"
						aria-controls="product-reviews-panel">리뷰</button>
					<button class="product-tab" id="product-inquiries-tab"
						type="button" role="tab" aria-selected="false" tabindex="-1"
						aria-controls="product-inquiries-panel">문의</button>
				</div>

				<section class="product-tab-panel" id="product-info-panel"
					role="tabpanel" aria-labelledby="product-info-tab" tabindex="0">
					<div class="product-description" id="product-description">
						<img class="product-description-image"
							src="<c:url value='/img/product-description.jpg'/>"
							alt="MSI 지포스 RTX 5060 Ti 벤투스 2X 제품 상세 설명" loading="lazy">
					</div>
					<div class="product-description-actions">
						<button class="product-description-toggle" type="button"
							aria-expanded="true" aria-controls="product-description">상품
							정보 접기</button>
					</div>
				</section>

				<section class="product-tab-panel" id="product-reviews-panel"
					role="tabpanel" aria-labelledby="product-reviews-tab" tabindex="0"
					hidden>
					<p class="product-empty-state">등록된 리뷰가 없습니다.</p>
				</section>
				<section class="product-tab-panel" id="product-inquiries-panel"
					role="tabpanel" aria-labelledby="product-inquiries-tab"
					tabindex="0" hidden>
					<p class="product-empty-state">등록된 문의가 없습니다.</p>
				</section>
			</div>

			<section class="product-purchase"
				aria-labelledby="product-summary-title">
				<div class="product-summary">
					<a class="product-summary-brand">ASUS &gt;</a>
					<h1 class="product-summary-title" id="product-summary-title">[ASUS]
						PRIME 지포스 RTX 5080 OC D7 16GB 대원씨티에스</h1>
					<div class="product-rating" aria-label="평점 5점 만점에 4.0점">
						<div class="product-rating-stars" aria-hidden="true">
							<img src="<c:url value='/icons/Star.svg'/>" alt=""> <img
								src="<c:url value='/icons/Star.svg'/>" alt=""> <img
								src="<c:url value='/icons/Star.svg'/>" alt=""> <img
								src="<c:url value='/icons/Star.svg'/>" alt=""> <img
								src="<c:url value='/icons/Star_empty.svg'/>" alt="">
						</div>
						<span class="product-rating-score">4.0</span>
					</div>
					<div class="product-pricing">
						<span class="product-discount">24%</span> <span
							class="product-price">1,200,000원</span> <span
							class="product-original-price">1,500,000원</span>
					</div>
				</div>

				<div class="product-purchase-controls" data-unit-price="1200000">
					<div class="product-delivery">
						<span>배송비</span><span>무료</span>
					</div>
					<div class="product-option">
						<p class="product-option-name">RTX 5080</p>
						<div class="product-option-row">
							<div class="product-quantity" role="group" aria-label="구매 수량">
								<button class="product-quantity-button product-quantity-minus"
									type="button" aria-label="수량 줄이기" disabled>
									<img src="<c:url value='/icons/Minus.svg'/>" alt="">
								</button>
								<input class="product-quantity-input" type="number"
									name="quantity" min="1" step="1" value="1" aria-label="구매 수량">
								<button class="product-quantity-button product-quantity-plus"
									type="button" aria-label="수량 늘리기">
									<img src="<c:url value='/icons/Plus.svg'/>" alt="">
								</button>
							</div>
							<span class="product-option-price">1,200,000원</span>
						</div>
					</div>
					<div class="product-total">
						<span class="product-total-label">총 구매금액</span>
						<output class="product-total-price" aria-live="polite">1,200,000원</output>
					</div>
					<div class="product-purchase-actions">
						<button class="product-favorite" type="button" aria-label="찜하기"
							aria-pressed="false">
							<img src="<c:url value='/icons/Heart.svg'/>" alt="">
						</button>
						<button class="product-cart-button" type="button" disabled
							title="장바구니 서비스 준비 중">장바구니</button>
						<button class="product-buy-button" type="button" disabled
							title="구매 서비스 준비 중">구매하기</button>
					</div>
				</div>
			</section>
		</div>
	</main>
</body>
</html>
