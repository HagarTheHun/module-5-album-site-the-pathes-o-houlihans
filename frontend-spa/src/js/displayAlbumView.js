 import { displaySongView, clearChildrenForSong } from "./displaySongView.js";
 import { displayHomeView } from "./displayHomeView.js";
 import { allAlbumJson } from "./sampleAllAlbums.js";

const displayAlbumView = function(album) {
    const mainElement = document.createElement("main");

    const backButtonElement = document.createElement("button");
    backButtonElement.classList.add("button");
    backButtonElement.innerText = "Back to Home";
    mainElement.appendChild(backButtonElement);

    const albumDataElement = document.createElement("div");
    mainElement.appendChild(albumDataElement);

    const albumImgElement = document.createElement("img");
    albumImgElement.classList.add("linkImg")
    albumImgElement.setAttribute("src", "" + album.img);
    albumDataElement.appendChild(albumImgElement);

    const albumTitleElement = document.createElement("h3");
    albumTitleElement.classList.add("albumTitle");
    albumTitleElement.innerText = album.name;
    albumDataElement.appendChild(albumTitleElement);

    const albumArtistElement = document.createElement("h4");
    albumArtistElement.classList.add("albumArtist");
    albumArtistElement.innerText = "by " + album.artist;
    albumDataElement.appendChild(albumArtistElement);

    const descriptionElement = document.createElement("p");
    descriptionElement.classList.add("description");
    descriptionElement.innerText = "This is a discription of the album that should probably be a value in the pojo."
    albumDataElement.appendChild(descriptionElement);

    const songListDivElement = document.createElement("div");
    songListDivElement.classList.add("songList");
    albumDataElement.appendChild(songListDivElement);

    const songListOlElement = document.createElement("ol");
    songListDivElement.appendChild(songListOlElement);

    backButtonElement.addEventListener("click", () =>{
        console.log("you pressed back, going to home")
        clearChildren(mainElement)
        document.querySelector(".container").append(displayHomeView(allAlbumJson))
    });

    album.songs.forEach(song => {
        let songLiElement = document.createElement("li");
        // let songLinkElement = document.createElement("a");
        // songLinkElement.setAttribute("href", "/songs/" + song.id);
        songLiElement.innerText = song.title;
        // songLiElement.appendChild(songLinkElement);
        songListOlElement.appendChild(songLiElement);

        songLiElement.addEventListener("click", () => {
            console.log("you clicked a song"),
            clearChildren(mainElement)
            document.querySelector(".container").append(displaySongView(album, song))
        });
    });

    return mainElement;
}

const clearChildren = function (element) {
    while (element.firstChild) {
      element.removeChild(element.lastChild);
    }
  }
  
export {displayAlbumView, clearChildren}

/* <main>
        <button class="button">Back</button>
        <img class="linkImg" src="/src/images/Cover_contra.jpg">
        <h3 class="albumTitle">Contra</h3>
        <h4 class="albumArtist">by <span class="artist">Vampire Weekend</span></h4>

        <p class="description">This album is by Vampire Weekend. I think it is the second one by them.</p>

        <p class="songList">
            <ol>
                <li> <a href="song.html">Horchata</a></li>
                <li>White Sky</li>
                <li>Holiday</li>
                <li>California English</li>
                <li>Taxi Cab</li>
                <li>Run</li>
                <li>Cousins</li>
                <li>Giving Up the Gun</li>
                <li>Diplomat's Son</li>
                <li>I Think Ur a Contra</li>
            </ol>
        </p>
    </main> */