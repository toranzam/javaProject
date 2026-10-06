(() => {
  const section = document.querySelector('.banner-section');
  if (!section) return;
  const track = section.querySelector('.banner-track');
  const viewport = section.querySelector('.banner-window');
  if (track.children.length < 5) return;
  let moving = false;
  let timer;
  let fallback;
  let direction;
  const center = 2;

  function activate(index) {
    [...track.children].forEach((slide, i) => {
      slide.classList.toggle('is-active', i === index);
    });
  }
  function position(index, animate) {
    const slide = track.children[index];
    const x = viewport.clientWidth / 2 - slide.offsetLeft - slide.offsetWidth / 2;
    track.style.transition = animate ? 'transform 400ms ease' : 'none';
    track.style.transform = `translateX(${x}px)`;
  }
  function finish() {
    if (!moving) return;
    clearTimeout(fallback);
    if (direction === 1) track.append(track.firstElementChild);
    else track.prepend(track.lastElementChild);
    position(center, false);
    moving = false;
  }
  function move(step) {
    if (moving) return;
    moving = true;
    direction = step;
    activate(center + step);
    position(center + step, true);
    fallback = setTimeout(finish, 500);
  }
  function stop() { clearInterval(timer); }
  function play() {
    stop();
    if (!document.hidden && !section.matches(':hover') && !section.contains(document.activeElement)) {
      timer = setInterval(() => move(1), 4000);
    }
  }
  track.addEventListener('transitionend', event => {
    if (event.target === track && event.propertyName === 'transform') finish();
  });
  section.querySelector('.banner-prev')?.addEventListener('click', () => move(-1));
  section.querySelector('.banner-next')?.addEventListener('click', () => move(1));
  section.addEventListener('mouseenter', stop);
  section.addEventListener('mouseleave', play);
  section.addEventListener('focusin', stop);
  section.addEventListener('focusout', () => setTimeout(play, 0));
  document.addEventListener('visibilitychange', play);
  window.addEventListener('resize', () => {
    finish();
    position(center, false);
  });
  // 기존 첫 활성 배너가 가운데에 오도록 순서를 맞춥니다.
  const initial = track.querySelector('.is-active') || track.children[0];
  while (track.children[center] !== initial) track.prepend(track.lastElementChild);
  activate(center);
  position(center, false);
  play();
})();
