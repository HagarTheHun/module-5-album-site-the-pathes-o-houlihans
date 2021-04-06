import { displayAlbumView, clearChildren } from "./displayAlbumView.js";
import { editSongView } from "./editSongView.js";

const displaySongView = function(album, song, albums) {
    const mainElement = document.createElement("main");
    
    const pageButtonsElement = document.createElement("div");
    pageButtonsElement.classList.add("pageButtons");
    mainElement.appendChild(pageButtonsElement);
    
        const backButtonElement = document.createElement("button");
        backButtonElement.classList.add("button");
        backButtonElement.innerText = "Back to the album";
        pageButtonsElement.appendChild(backButtonElement);

        const editButtonElement = document.createElement("button");
        editButtonElement.classList.add("button");
        editButtonElement.innerText = "Edit Page";
        pageButtonsElement.appendChild(editButtonElement);

    
    const descriptionElement = document.createElement("div"); /*this part might need changed*/
    descriptionElement.classList.add("descriptionDiv");
    mainElement.appendChild(descriptionElement);
    
        const songTitleElement = document.createElement("h3");
        songTitleElement.classList.add("songTitle");
        songTitleElement.innerText = song.title;
        descriptionElement.appendChild(songTitleElement);

        const songArtistAlbumElement = document.createElement("h4");
        songArtistAlbumElement.classList.add("songArtist");
        songArtistAlbumElement.innerText = "by " + album.artist + " on " + album.name;
        descriptionElement.appendChild(songArtistAlbumElement);


    const songDetailsElement = document.createElement("div");
    songDetailsElement.classList.add("songDetails");
    mainElement.appendChild(songDetailsElement);

    // const songDurationElement = document.createElement("p");
    // songDurationElement.classList.add("songDurationLine");
    // songDurationElement.innerText = "";

        const lyricsIntroElement = document.createElement("p");
        lyricsIntroElement.classList.add("lyricsIntro");
        lyricsIntroElement.innerText = "The lyrics acording to google are:"; /* probbaly should change*/
        songDetailsElement.appendChild(lyricsIntroElement);

        const lyricsElement = document.createElement("p");
        lyricsElement.classList.add("songLyrics");
        lyricsElement.innerText = song.lyrics;
        songDetailsElement.appendChild(lyricsElement);

    backButtonElement.addEventListener("click", () =>{
        console.log("you pressed back, going to album")
        clearChildren(mainElement)
        document.querySelector(".container").append(displayAlbumView(album, albums))
    });
    editButtonElement.addEventListener("click", () =>{
        console.log("you presed Edit Page, putting down the edit boxes")
        clearChildren(mainElement)
        document.querySelector(".container").append(editSongView(album,song, albums))
    });

    return mainElement;
} 

const clearChildrenForSong = function (element) {
    while (element.firstChild) {
      element.removeChild(element.lastChild);
    }
}

export {displaySongView, clearChildrenForSong}



/* <main>
    <button class="button">Back</button>
    <div>
        <h3 class="songTitle">Horchata</h3>
        <h4 class="songArtist">by<span class="artist"> Vampire Weekend </span> on <span class="songAlbum"><a href="album.html">Contra</a></span></h4>
    </div>

    <div class="songDetails">
        <p class="songDurationLine">This song is <span id="songDuration">4m30s</span> long. </p>
        <p class="lyricsIntro">The lyrics acording to google are:</p>
        <p><span class="songLyrics">lyrics lyrics lyrics lyrics lyrics lyrics lyrics lyrics lyrics lyrics lyrics v lyric lyrics lyrics lyrics lyrics 
            lyrics lyrics lyrics lyrics lyrics lyrics lyrics lyrics lyrics </span>
        </p>
    </div>
</main> */