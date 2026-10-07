(() => {
  const postalCodeInput = document.getElementById("join-postal-code");
  const addressInput = document.getElementById("join-address-line1");
  const detailAddressInput = document.getElementById("join-address-line2");
  const searchButton = document.getElementById("join-address-search");

  if (!postalCodeInput || !addressInput || !detailAddressInput || !searchButton) return;

  const openAddressSearch = () => {
    if (!window.kakao?.Postcode) {
      window.alert("주소 검색 서비스를 불러오지 못했습니다. 잠시 후 다시 시도해주세요.");
      return;
    }

    new window.kakao.Postcode({
      oncomplete: (data) => {
        const address = data.roadAddress || data.jibunAddress;
        const extraAddress = [];

        if (data.roadAddress) {
          if (data.bname && /[동로가]$/.test(data.bname)) {
            extraAddress.push(data.bname);
          }
          if (data.apartment === "Y" && data.buildingName) {
            extraAddress.push(data.buildingName);
          }
        }

        postalCodeInput.value = data.zonecode;
        addressInput.value = address + (extraAddress.length ? ` (${extraAddress.join(", ")})` : "");
        detailAddressInput.value = "";
        detailAddressInput.focus();
      },
    }).open({ popupName: "join-address-search" });
  };

  searchButton.addEventListener("click", openAddressSearch);
})();
