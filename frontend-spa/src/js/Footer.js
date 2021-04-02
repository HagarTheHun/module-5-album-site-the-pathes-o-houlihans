const createFooter = function() {
    const footer = document.createElement("footer");
    footer.classList.add("main-footer");
    footer.innerHTML = '<footer>Site by the unfortnate typo, the-pathes-o-houlihans.</footer>'
    return footer;
}

export {
    createFooter
}