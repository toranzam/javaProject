(() => {
  const purchase = document.querySelector(".product-purchase-controls");

  if (purchase) {
    const quantityInput = purchase.querySelector(".product-quantity-input");
    const minusButton = purchase.querySelector(".product-quantity-minus");
    const plusButton = purchase.querySelector(".product-quantity-plus");
    const optionPrice = purchase.querySelector(".product-option-price");
    const totalPrice = purchase.querySelector(".product-total-price");
    const unitPrice = Number(purchase.dataset.unitPrice);
    const numberFormat = new Intl.NumberFormat("ko-KR");
    const maxQuantity = Math.floor(Number.MAX_SAFE_INTEGER / unitPrice);

    const updateQuantity = (value) => {
      const parsed = Math.floor(Number(value));
      const quantity = Number.isFinite(parsed)
        ? Math.min(maxQuantity, Math.max(1, parsed))
        : 1;
      const amount = `${numberFormat.format(unitPrice * quantity)}원`;

      quantityInput.value = String(quantity);
      quantityInput.style.width = `${Math.max(24, String(quantity).length * 8 + 8)}px`;
      optionPrice.textContent = amount;
      totalPrice.textContent = amount;
      minusButton.disabled = quantity === 1;
      plusButton.disabled = quantity === maxQuantity;
    };

    minusButton.addEventListener("click", () => {
      updateQuantity(Number(quantityInput.value) - 1);
    });
    plusButton.addEventListener("click", () => {
      updateQuantity(Number(quantityInput.value) + 1);
    });
    quantityInput.addEventListener("input", () => {
      if (quantityInput.value !== "" && quantityInput.validity.valid) {
        updateQuantity(quantityInput.value);
      }
    });
    const commitQuantity = () => updateQuantity(quantityInput.value);
    quantityInput.addEventListener("change", commitQuantity);
    quantityInput.addEventListener("blur", commitQuantity);
    updateQuantity(quantityInput.value);

    const favorite = purchase.querySelector(".product-favorite");
    favorite.addEventListener("click", () => {
      const pressed = favorite.getAttribute("aria-pressed") === "true";
      favorite.setAttribute("aria-pressed", String(!pressed));
      favorite.setAttribute("aria-label", pressed ? "찜하기" : "찜 취소");
    });
  }

  const tabs = [...document.querySelectorAll(".product-tab")];
  const selectTab = (selected) => {
    tabs.forEach((tab) => {
      const active = tab === selected;
      tab.classList.toggle("is-active", active);
      tab.setAttribute("aria-selected", String(active));
      tab.tabIndex = active ? 0 : -1;
      document.getElementById(tab.getAttribute("aria-controls")).hidden = !active;
    });
  };

  tabs.forEach((tab, index) => {
    tab.addEventListener("click", () => selectTab(tab));
    tab.addEventListener("keydown", (event) => {
      let nextIndex;

      if (event.key === "ArrowRight") nextIndex = (index + 1) % tabs.length;
      else if (event.key === "ArrowLeft") nextIndex = (index - 1 + tabs.length) % tabs.length;
      else if (event.key === "Home") nextIndex = 0;
      else if (event.key === "End") nextIndex = tabs.length - 1;
      else return;

      event.preventDefault();
      selectTab(tabs[nextIndex]);
      tabs[nextIndex].focus();
    });
  });

  const toggle = document.querySelector(".product-description-toggle");
  if (toggle) {
    const description = document.getElementById(toggle.getAttribute("aria-controls"));
    toggle.addEventListener("click", () => {
      const expanded = toggle.getAttribute("aria-expanded") === "true";
      description.hidden = expanded;
      toggle.setAttribute("aria-expanded", String(!expanded));
      toggle.textContent = expanded ? "상품 정보 펼치기" : "상품 정보 접기";
      if (expanded) toggle.scrollIntoView({ block: "nearest" });
    });
  }
})();
