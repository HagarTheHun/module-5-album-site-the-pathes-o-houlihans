const displayAlbumView = function(album) {
    const mainElement = document.createElement("main");

    const albumImgElement = document.createElement("img");
    albumImgElement.classList.add("linkImg")
    albumImgElement.setAttribute("src", "" + album.img);
    mainElement.appendChild(albumImgElement);

    const albumTitleElement = document.createElement("h3");
    albumTitleElement.classList.add("albumTitle");
    albumTitleElement.innerText = album.name;
    mainElement.appendChild(albumTitleElement);

    const albumArtistElement = document.createElement("h4");
    albumArtistElement.classList.add("albumArtist");
    albumArtistElement.innerText = "by " + album.artist;
    mainElement.appendChild(albumArtistElement);

    const descriptionElement = document.createElement("p");
    descriptionElement.classList.add("description");
    descriptionElement.innerText = "This is a discription of the album that should probably be a value in the pojo."
    mainElement.appendChild(descriptionElement);

    const songListDivElement = document.createElement("div");
    songListDivElement.classList.add("songList");
    mainElement.appendChild(songListDivElement);

    const songListOlElement = document.createElement("ol");
    songListDivElement.appendChild(songListOlElement);

    album.songs.forEach(song => {
        let songLiElement = document.createElement("li");
        let songLinkElement = document.createElement("a");
        songLinkElement.setAttribute("href", "/songs/" + song.id);
        songLinkElement.innerText = song.title;
        songLiElement.appendChild(songLinkElement);
        songListOlElement.appendChild(songLiElement);
    });

    return mainElement;
}

export {displayAlbumView}

/* <main>
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