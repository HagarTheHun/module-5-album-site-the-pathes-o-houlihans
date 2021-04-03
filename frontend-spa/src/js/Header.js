 import { clearChildren } from "./displayAlbumView.js";
 import { displayHomeView } from "./displayHomeView.js";
 import { allAlbumJson } from "./sampleAllAlbums.js";
 import { createFooter } from "./Footer.js"

const createHeader = function () {
    const header = document.createElement("header");
    header.classList.add("main-header");
    //header.innerHTML = '<h1 class="main-heade-title"><a href="home.html">Sitename</a></h1>'
    let title = document.createElement("h1");
    title.innerText = "JukeBox";
    header.appendChild(title);
    //header.innerText = "JukeBox"
    console.log(header);
    title.addEventListener("click", () => {
        console.log("Going Home...")
        console.log(document.querySelector(".container"))
        clearChildren(document.querySelector(".container"))
        document.querySelector(".container").prepend(createHeader());
        document.querySelector(".container").append(displayHomeView(allAlbumJson));
        document.querySelector(".container").append(createFooter());
    });
    return header;
}




export {
    createHeader
}