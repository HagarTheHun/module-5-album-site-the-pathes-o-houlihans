//import { displayAlbumView } from "./displayAlbumView";

import { displayAlbumView, clearChildren } from "./displayAlbumView.js";

const displayHomeView = function (albums) {
    const mainElement = document.createElement("main");
    mainElement.classList.add("main-content");

    const descriptionElement = document.createElement("div");
    descriptionElement.classList.add("description-box");
    mainElement.appendChild(descriptionElement);

    const pElement = document.createElement("p");
    pElement.classList.add("description");
    descriptionElement.appendChild(pElement);
    pElement.innerHTML = '<p class="description">This site is to review albums and songs from many artisits.</p>';


    const sectionElement = document.createElement("div");
    sectionElement.classList.add("albumList");
    mainElement.appendChild(sectionElement);

    const ulElement = document.createElement("ul");
    ulElement.classList.add("flex-container");
    sectionElement.appendChild(ulElement);

    albums.forEach(album => {
        let albumElement = document.createElement("li");
        //albumElement.innerText = album.name;
        let albumImg = document.createElement("img");
        
        // albumLink.setAttribute("href", "/albums/" + album.id)
         albumImg.setAttribute("src",album.img)
         albumImg.classList.add("linkImg")
        
        albumElement.appendChild(albumImg)
        ulElement.appendChild(albumElement);
    
        albumImg.addEventListener("click", () =>{
            console.log("you clicked me"),
            clearChildren(mainElement)
            document.querySelector(".container").append(displayAlbumView(album))
        });
    });
    return mainElement;

}

export{
    displayHomeView
} 

/* <img src="/files/16797/clock-demo-200px.png"
       alt="Clock"
       srcset="/files/16864/clock-demo-200px.png 1x, /files/16797/clock-demo-400px.png 2x"></img> */

/* <main class="main-content">
<div id="description-box">
    <p class="description">This site is to review albums and songs from many artisits.</p>
</div>

<div class="albumList">
    <p>
        <ul class="flex-container">
            <li class=""><a href="album.html"><img class="linkImg" src="/src/images/Cover_contra.jpg"></a></li>
            <li class=""><a href="album.html"><img class="linkImg"src="/src/images/C-W-McCall-S-Greatest-Hits-cover.jpg"></a></li>
            <li class=""><img class="linkImg" src="/src/images/James Adomian.jpg"></li>
            <li class=""><img class="linkImg" src="/src/images/KKinane Trampoline.jpg"></li>
            <li class=""><img class="linkImg" src="/src/images/Black Pumas.jpg"></li>
            <li class=""><img class="linkImg" src="/src/images/Tom Segura CN.jpg"></li>
            <li class=""><img class="linkImg" src="/src/images/Matt Braunger.jpg"></li>
        </ul>
    </p>
</div>
</main> */