// import { displaySongView, clearChildrenForSong } from "./displaySongView.js";
// import { displayHomeView } from "./displayHomeView.js";
// import { allAlbumJson } from "./sampleAllAlbums.js";
import {displayAlbumView, clearChildren} from "./displayAlbumView.js";



const editAlbumView = function(album) {
    const mainElement = document.createElement("main");

    const pageButtonsElement = document.createElement("div");
    pageButtonsElement.classList.add("pageButtons");
    mainElement.appendChild(pageButtonsElement);

        const editButtonElement = document.createElement("button");
        editButtonElement.classList.add("button");
        editButtonElement.innerText = "Stop Edit";
        pageButtonsElement.appendChild(editButtonElement);

    const formElement = document.createElement("form"); 
    mainElement.appendChild(formElement);

        const albumDataElement = document.createElement("div");
        formElement.appendChild(albumDataElement);

            const albumCoverDivElement = document.createElement("div");
            albumCoverDivElement.classList.add("albumCoverDiv");
            albumDataElement.appendChild(albumCoverDivElement);

                const albumImgElement = document.createElement("img");
                albumImgElement.classList.add("linkImg")
                albumImgElement.setAttribute("src", "" + album.img);
                albumCoverDivElement.appendChild(albumImgElement);

                const albumCoverInput = document.createElement("input");
                albumCoverInput.setAttribute("type", "text");
                albumCoverInput.setAttribute("placeholder", "Put an image url here");
                albumCoverInput.setAttribute("name", "albumCover");
                albumCoverDivElement.appendChild(albumCoverInput);

            const albumTitleDivElement = document.createElement("div");
            albumTitleDivElement.classList.add("albumTitleDiv");
            albumDataElement.appendChild(albumTitleDivElement);

                const albumTitleElement = document.createElement("h3");
                albumTitleElement.classList.add("albumTitle");
                albumTitleElement.innerText = album.name;
                albumTitleDivElement.appendChild(albumTitleElement);

                const albumTitleInput = document.createElement("input");
                albumTitleInput.setAttribute("type", "text");
                albumTitleInput.setAttribute("placeholder", "New Album Title");
                albumTitleInput.setAttribute("name", "name");
                albumTitleDivElement.appendChild(albumTitleInput);

            const albumArtistDivElement = document.createElement("div");
            albumArtistDivElement.classList.add("albumArtistDiv");
            albumDataElement.appendChild(albumArtistDivElement);

                const albumArtistElement = document.createElement("h4");
                albumArtistElement.classList.add("albumArtist");
                albumArtistElement.innerText = "by " + album.artist;
                albumArtistDivElement.appendChild(albumArtistElement);

                const albumArtistInput = document.createElement("input");
                albumArtistInput.setAttribute("type", "text");
                albumArtistInput.setAttribute("placeholder", "New Artist");
                albumArtistInput.setAttribute("name", "artist");
                albumArtistDivElement.appendChild(albumArtistInput);

            const descriptionDivElement = document.createElement("div");
            descriptionDivElement.classList.add("descriptionDiv");
            albumDataElement.appendChild(descriptionDivElement);

                const descriptionElement = document.createElement("p");
                descriptionElement.classList.add("description");
                descriptionElement.innerText = "This is a discription of the album that should probably be a value in the pojo."
                descriptionDivElement.appendChild(descriptionElement);

                const descriptionTextarea = document.createElement("textarea");
                descriptionTextarea.setAttribute("placeholder", "New description here");
                descriptionTextarea.setAttribute("name", "discription");
                descriptionDivElement.appendChild(descriptionTextarea);

        const submitButton = document.createElement("button");
        submitButton.setAttribute("type", "button"); //can't actually be submit because it will reload the page
        submitButton.setAttribute("class", "button");
        submitButton.innerText = "Submit changes";
        albumDataElement.appendChild(submitButton);

            const songListDivElement = document.createElement("div");
            songListDivElement.classList.add("songList");
            albumDataElement.appendChild(songListDivElement);

                const removalWarningElement = document.createElement("p");
                removalWarningElement.innerText = "If you hit the remove button it will destroy the song above it and it's reviews";
                songListDivElement.appendChild(removalWarningElement);

                const songListOlElement = document.createElement("ol");
                songListDivElement.appendChild(songListOlElement);

//    backButtonElement.addEventListener("click", () =>{
//        console.log("you pressed back, going to home")
//        clearChildren(mainElement)
//        document.querySelector(".container").append(displayHomeView(allAlbumJson))
//    });
    editButtonElement.addEventListener("click", () =>{
        console.log("you presed Stop Edit Page, hopefully you hit the submit button if you wanted to save your changes")
        clearChildren(mainElement)
        document.querySelector(".container").append(displayAlbumView(album))
    });

    submitButton.addEventListener("click", ()=>{
        console.log("this is the submit button")
        //then send the info where it goes to update
    });
                

            album.songs.forEach(song => {
                let songLiElement = document.createElement("li");
                songLiElement.innerText = song.title;
                songListOlElement.appendChild(songLiElement);

                let removeSongButtonElement = document.createElement("button");
                removeSongButtonElement.classList.add("button");
                removeSongButtonElement.setAttribute("type", "button");
                removeSongButtonElement.innerText  = "Remove";
                songLiElement.appendChild(removeSongButtonElement);

                removeSongButtonElement.addEventListener("click", () =>{
                    console.log("BOOM, destoryed " + song.title);
                    //then send the delete message to the backend
                });

                // songLiElement.addEventListener("click", () => {
                //     console.log("you clicked a song"),
                //     clearChildren(mainElement)
                //     document.querySelector(".container").append(displaySongView(album, song))
                // });
            });
            

   return mainElement;
}

 
export {editAlbumView}

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
/* <main>
<div class="pageButtons">
    <button class="button">Stop Edit</button>
</div>
<form>
    <!-- needs some atributes -->
    <div class="albumData">
        <div class="albumCoverDiv">
            <img class="linkImg" src="/src/images/Cover_contra.jpg">
            <input type="text" placeholder="Put an image url here" name="albumCover">
        </div>
        <div class="albumTitleDiv">
            <h3 class="albumTitle">Contra</h3>
            <input type="text" placeholder="New Album Title" name="name">
        </div>
        <div class="albumArtistDiv">
            <h4 class="albumArtist">by <span class="artist">Vampire Weekend</span></h4>
            <input type="text" placeholder="New Artist" name="artist">
        </div>

        <div class="descriptionDiv">
            <p class="description">This album is by Vampire Weekend. I think it is the second one by them.</p>
            <textarea placeholder="New description here" name="discription"></textarea>
        </div>

        <div class="songListDiv">
            <p class="songList">
                <p>Make each of these have an input</p>
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
        </div>
    </div>
</form>
</main> */