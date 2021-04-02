const createHeader = function () {
    const header = document.createElement("header");
    header.classList.add("main-header");
    header.innerHTML = '<h1 class="main-heade-title"><a href="home.html">Sitename</a></h1>'
    return header;
}

export {
    createHeader
}