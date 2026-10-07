<%@ page pageEncoding="UTF-8"%>
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
