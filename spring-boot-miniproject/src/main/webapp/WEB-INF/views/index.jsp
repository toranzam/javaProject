<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/css/basic.css'/>">
<link rel="stylesheet" href="<c:url value='/css/index.css'/>">

<script src="<c:url value='/js/index.js'/>" defer></script>

</head>
<body>

	<nav class="site-nav">
		<div class="nav-main">
			<div class="nav-inner">
				<h1 class="nav-logo">
					<a href="<c:url value='/'/>">PC PICK</a>
				</h1>


				<div class="nav-controls">
					<div class="nav-search">
						<input class="nav-search-input" placeHolder="RTX 5090 사전예약" /> <img
							src="<c:url value='/icons/Search.svg'/>">
					</div>
					<div class="nav-actions">
						<img class="nav-action-icon"
							src="<c:url value='/icons/Union.svg'/>"> <img
							class="nav-action-icon" src="<c:url value='/icons/My_page.svg'/>">
						<img class="nav-action-icon"
							src="<c:url value='/icons/Shopping_bag.svg'/>">

					</div>
				</div>

			</div>
		</div>
		<div class="nav-categories">
			<div class="nav-inner">
				<div class="nav-category-toggle">
					<img class="nav-category-icon"
						src="<c:url value='/icons/Category.svg'/>"> <span>카테고리</span>
				</div>
				<div class="nav-category-list">
					<a class="nav-category-link">전체</a> <a class="nav-category-link">CPU</a>
					<a class="nav-category-link">메인보드</a> <a class="nav-category-link">RAM</a>
					<a class="nav-category-link">SSD</a> <a class="nav-category-link">파워</a>
					<a class="nav-category-link">케이스</a> <a class="nav-category-link">모니터·주변기기</a>
				</div>
			</div>
		</div>
	</nav>

	<main class="site-main">
		<div class="main-inner">
			<section class="banner-section" aria-label="이벤트 배너">
				<div class="banner-window">
					<div class="banner-track">
						<div class="banner-slide">
							<div class="banner-card">배너 1</div>
						</div>
						<div class="banner-slide is-active">
							<div class="banner-card">배너 2</div>
						</div>
						<div class="banner-slide">
							<div class="banner-card">배너 3</div>
						</div>
						<div class="banner-slide">
							<div class="banner-card">배너 4</div>
						</div>
						<div class="banner-slide">
							<div class="banner-card">배너 5</div>
						</div>
					</div>
				</div>

				<button class="banner-prev" type="button" aria-label="이전 배너">
					<span aria-hidden="true">&#10094;</span>
				</button>
				<button class="banner-next" type="button" aria-label="다음 배너">
					<span aria-hidden="true">&#10095;</span>
				</button>

			</section>
			<section class="quick-links" aria-label="브랜드 바로가기">
				<div class="quick-links-inner">
					<a class="quick-link" href="#">
						<div class="quick-link-image">
							<img src="<c:url value='/img/iphone.avif'/>" alt="">
						</div> <span class="quick-link-label">ASUS</span>
					</a> <a class="quick-link" href="#">
						<div class="quick-link-image">
							<img src="<c:url value='/img/iphone.avif'/>" alt="">
						</div> <span class="quick-link-label">ASUS</span>
					</a> <a class="quick-link" href="#">
						<div class="quick-link-image">
							<img src="<c:url value='/img/iphone.avif'/>" alt="">
						</div> <span class="quick-link-label">ASUS</span>
					</a> <a class="quick-link" href="#">
						<div class="quick-link-image">
							<img src="<c:url value='/img/iphone.avif'/>" alt="">
						</div> <span class="quick-link-label">ASUS</span>
					</a> <a class="quick-link" href="#">
						<div class="quick-link-image">
							<img src="<c:url value='/img/iphone.avif'/>" alt="">
						</div> <span class="quick-link-label">ASUS</span>
					</a> <a class="quick-link" href="#">
						<div class="quick-link-image">
							<img src="<c:url value='/img/iphone.avif'/>" alt="">
						</div> <span class="quick-link-label">ASUS</span>
					</a> <a class="quick-link" href="#">
						<div class="quick-link-image">
							<img src="<c:url value='/img/iphone.avif'/>" alt="">
						</div> <span class="quick-link-label">ASUS</span>
					</a> <a class="quick-link" href="#">
						<div class="quick-link-image">
							<img src="<c:url value='/img/iphone.avif'/>" alt="">
						</div> <span class="quick-link-label">ASUS</span>
					</a>
				</div>
			</section>
			<section class="popular-products">
				<h2 class="popular-products-title">인기상품 PICK</h2>
				<div class="product-list">
					<div class="product-card">
						<a class="product-image-link"> <img class="product-image"
							src="<c:url value='/img/card.jpg'/>">
						</a>

						<div class="product-info">
							<div class="product-heading">
								<a class="product-brand">ASUS &gt;</a> <a class="product-name">[ASUS]
									PRIME 지포스 RTX 5080 OC D7 16GB 대원씨티에스</a>
							</div>
							<div class="product-pricing">
								<span class="product-discount">24%</span> <span
									class="product-price">1,200,000원</span> <span
									class="product-original-price">1,500,000원</span>
							</div>

							<div class="product-details">
								<div class="product-rating">
									<div class="product-rating-stars">
										<img src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>">
									</div>
									<span class="product-rating-score">4.0</span>
								</div>

								<div class="product-benefits">
									<div class="product-benefit">
										<span class="product-shipping">배송비 3,000원</span>
									</div>
									<div class="product-benefit">
										<span class="product-points">600P 적립</span>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="product-card">
						<a class="product-image-link"> <img class="product-image"
							src="<c:url value='/img/card.jpg'/>">
						</a>

						<div class="product-info">
							<div class="product-heading">
								<a class="product-brand">ASUS &gt;</a> <a class="product-name">[ASUS]
									PRIME 지포스 RTX 5080 OC D7 16GB 대원씨티에스</a>
							</div>
							<div class="product-pricing">
								<span class="product-discount">24%</span> <span
									class="product-price">1,200,000원</span> <span
									class="product-original-price">1,500,000원</span>
							</div>

							<div class="product-details">
								<div class="product-rating">
									<div class="product-rating-stars">
										<img src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>">
									</div>
									<span class="product-rating-score">4.0</span>
								</div>

								<div class="product-benefits">
									<div class="product-benefit">
										<span class="product-shipping">배송비 3,000원</span>
									</div>
									<div class="product-benefit">
										<span class="product-points">600P 적립</span>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="product-card">
						<a class="product-image-link"> <img class="product-image"
							src="<c:url value='/img/card.jpg'/>">
						</a>

						<div class="product-info">
							<div class="product-heading">
								<a class="product-brand">ASUS &gt;</a> <a class="product-name">[ASUS]
									PRIME 지포스 RTX 5080 OC D7 16GB 대원씨티에스</a>
							</div>
							<div class="product-pricing">
								<span class="product-discount">24%</span> <span
									class="product-price">1,200,000원</span> <span
									class="product-original-price">1,500,000원</span>
							</div>

							<div class="product-details">
								<div class="product-rating">
									<div class="product-rating-stars">
										<img src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>">
									</div>
									<span class="product-rating-score">4.0</span>
								</div>

								<div class="product-benefits">
									<div class="product-benefit">
										<span class="product-shipping">배송비 3,000원</span>
									</div>
									<div class="product-benefit">
										<span class="product-points">600P 적립</span>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="product-card">
						<a class="product-image-link"> <img class="product-image"
							src="<c:url value='/img/card.jpg'/>">
						</a>

						<div class="product-info">
							<div class="product-heading">
								<a class="product-brand">ASUS &gt;</a> <a class="product-name">[ASUS]
									PRIME 지포스 RTX 5080 OC D7 16GB 대원씨티에스</a>
							</div>
							<div class="product-pricing">
								<span class="product-discount">24%</span> <span
									class="product-price">1,200,000원</span> <span
									class="product-original-price">1,500,000원</span>
							</div>

							<div class="product-details">
								<div class="product-rating">
									<div class="product-rating-stars">
										<img src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>">
									</div>
									<span class="product-rating-score">4.0</span>
								</div>

								<div class="product-benefits">
									<div class="product-benefit">
										<span class="product-shipping">배송비 3,000원</span>
									</div>
									<div class="product-benefit">
										<span class="product-points">600P 적립</span>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="product-card">
						<a class="product-image-link"> <img class="product-image"
							src="<c:url value='/img/card.jpg'/>">
						</a>

						<div class="product-info">
							<div class="product-heading">
								<a class="product-brand">ASUS &gt;</a> <a class="product-name">[ASUS]
									PRIME 지포스 RTX 5080 OC D7 16GB 대원씨티에스</a>
							</div>
							<div class="product-pricing">
								<span class="product-discount">24%</span> <span
									class="product-price">1,200,000원</span> <span
									class="product-original-price">1,500,000원</span>
							</div>

							<div class="product-details">
								<div class="product-rating">
									<div class="product-rating-stars">
										<img src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>"> <img
											src="<c:url value='/icons/Star.svg'/>">
									</div>
									<span class="product-rating-score">4.0</span>
								</div>

								<div class="product-benefits">
									<div class="product-benefit">
										<span class="product-shipping">배송비 3,000원</span>
									</div>
									<div class="product-benefit">
										<span class="product-points">600P 적립</span>
									</div>
								</div>
							</div>
						</div>
					</div>
					


				</div>
				<a class="popular-products-more" href="#"> 인기상품 더보기 &gt; </a>
			</section>
		</div>
	</main>


</body>
</html>