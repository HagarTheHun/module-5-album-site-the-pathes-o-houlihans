const displaySongView = function(album, song) {
    const mainElement = document.createElement("main");
    
    const descriptionElement = document.createElement("div"); /*this part might need changed*/
    mainElement.appendChild(descriptionElement);
    
    const songTitleElement = document.createElement("h3");
    songTitleElement.classList.add("songTitle");
    songTitleElement.innerText = ${song.title}
    descriptionElement.appendChild(songTitleElement);

    const songArtistAlbumElement = document.createElement("h4");
    songArtistAlbumElement.classList.add("songArtist");
    songArtistAlbumElement.innerText = "by " + ${album.artist} + " on " + ${album.name};
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
    lyricsElement.innerText = ${song.lyrics};
    songDetailsElement.appendChild(lyricsElement);



    return mainElement;
} 

const clearChildrenForSong = function (element) {
    while (element.firstChild) {
      element.removeChild(element.lastChild);
    }
}

export {displaySongView, clearChildrenForSong}



/* <main>
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