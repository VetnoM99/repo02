function addEmoticon(method) {
  const emoticons = [",😀,", ",😊,", ",😎,", ",🥳,", ",😂,", ",😜,", ",😍,"];
  const randomEmoticon =
    emoticons[Math.floor(Math.random() * emoticons.length)];
  const container = document.getElementById("emoticons");
  const span = document.createElement("span");
  span.textContent = randomEmoticon;
  span.classList.add("emoticon", "slide-in");

  if (method === "push") {
    container.appendChild(span);
  } else if (method === "unshift") {
    container.insertBefore(span, container.firstChild);
  } else if (method === "insert") {
    const spaces = document.getElementById("spaces").value;
    const index = Math.min(
      container.children.length,
      Math.max(0, parseInt(spaces))
    );
    container.insertBefore(span, container.children[index]);
  }
}

function removeEmoticon(method) {
  const container = document.getElementById("emoticons");
  const emoticon =
    method === "pop"
      ? container.lastElementChild
      : method === "shift"
      ? container.firstElementChild
     : method === 'random' ? container.children[Math.floor(Math.random() * container.children.length)] : null;

  if (emoticon) {
    emoticon.classList.add("slide-out");
    setTimeout(() => {
      container.removeChild(emoticon);
    }, 500);
  }
}

function removeAllEmoticons() {
  const container = document.getElementById("emoticons");
  const emoticons = container.children;

  for (let i = 0; i < emoticons.length; i++) {
    emoticons[i].classList.add("slide-out");
  }

  setTimeout(() => {
    container.innerHTML = "";
  }, 500);
}




