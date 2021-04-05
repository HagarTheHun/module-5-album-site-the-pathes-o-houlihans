import { displayAlbumView, clearChildren } from "./displayAlbumView.js";
import { displaySongView } from "./displaySongView.js";

const editSongView = function(album, song) {
    const mainElement = document.createElement("main");
    
    const pageButtonsElement = document.createElement("div");
    pageButtonsElement.classList.add("pageButtons");
    mainElement.appendChild(pageButtonsElement);
    
        // const backButtonElement = document.createElement("button");
        // backButtonElement.classList.add("button");
        // backButtonElement.innerText = "Back to the album";
        // pageButtonsElement.appendChild(backButtonElement);

        const editButtonElement = document.createElement("button");
        editButtonElement.classList.add("button");
        editButtonElement.innerText = "Stop Edit";
        pageButtonsElement.appendChild(editButtonElement);

    const formElement = document.createElement("form");
    // needs some atributes
    mainElement.appendChild(formElement);

        const descriptionElement = document.createElement("div"); /*this part might need changed*/
        formElement.appendChild(descriptionElement);
        
            const titleDivElement = document.createElement("div");
            titleDivElement.classList.add("titleDiv");
            descriptionElement.appendChild(titleDivElement)

                const songTitleElement = document.createElement("h3");
                songTitleElement.classList.add("songTitle");
                songTitleElement.innerText = song.title;
                titleDivElement.appendChild(songTitleElement);

                const songTitleInput = document.createElement("input");
                songTitleInput.setAttribute("type", "text");
                songTitleInput.setAttribute("placholder", "New song title");
                songTitleInput.setAttribute("name", "songTitle");
                titleDivElement.appendChild(songTitleInput);

            const artistAlbumDivElement = document.createElement("div");
            artistAlbumDivElement.classList.add("artistAlbumDiv");
            descriptionElement.appendChild(artistAlbumDivElement);

                const songArtistAlbumElement = document.createElement("h4");
                songArtistAlbumElement.classList.add("songArtist");
                songArtistAlbumElement.innerText = "by " + album.artist + " on " + album.name;
                artistAlbumDivElement.appendChild(songArtistAlbumElement);

                const clarifyPElement = document.createElement("p");
                clarifyPElement.innerHTML = "<p>Note, these are atributes of the album</p>";
                artistAlbumDivElement.appendChild(clarifyPElement);

        const songDetailsElement = document.createElement("div");
        songDetailsElement.classList.add("songDetails");
        formElement.appendChild(songDetailsElement);

            const songLengthDivElement = document.createElement("div");
            songLengthDivElement.classList.add("songLengthDiv");
            songDetailsElement.appendChild(songLengthDivElement);

                // const songDurationPElement = document.createElement("p");
                // songDurationElement.classList.add("songDurationLine");
                // songDurationElement.innerText = "";
                // songLengthDivElement.appendChild(songDurationPElement);

                const songDurationInput = document.createElement("input");
                songDurationInput.setAttribute("type", "text");
                songDurationInput.setAttribute("placeholder", "#m##s");
                songDurationInput.setAttribute("name", "songDuration");
                songLengthDivElement.appendChild(songDurationInput);

            const lyricsDivElement = document.createElement("div");
            lyricsDivElement.classList.add("lyricsDiv");
            songDetailsElement.appendChild(lyricsDivElement);

                const lyricsIntroElement = document.createElement("p");
                lyricsIntroElement.classList.add("lyricsIntro");
                lyricsIntroElement.innerText = "The lyrics acording to google are:"; /* probbaly should change*/
                lyricsDivElement.appendChild(lyricsIntroElement);

                const lyricsElement = document.createElement("pre");
                lyricsElement.classList.add("songLyrics");
                lyricsElement.innerText = song.lyrics;
                lyricsDivElement.appendChild(lyricsElement);

                const lyricsTextArea = document.createElement("textarea");
                lyricsTextArea.setAttribute("name", "songLyrics");
                lyricsDivElement.appendChild(lyricsTextArea);

        const hiddenIdInput = document.createElement("input");
        hiddenIdInput.setAttribute("type", "hidden");
        hiddenIdInput.setAttribute("value", song.id);
        formElement.appendChild(hiddenIdInput);

        const submitButton = document.createElement("button");
        submitButton.setAttribute("type", "button"); //can actually be submit because it will reload the page
        submitButton.setAttribute("class", "button");
        submitButton.innerText = "Submit changes";
        formElement.appendChild(submitButton);


    // backButtonElement.addEventListener("click", () =>{
    //     console.log("you pressed back, going to album")
    //     clearChildren(mainElement)
    //     document.querySelector(".container").append(displayAlbumView(album))
    // });
    editButtonElement.addEventListener("click", () =>{
        console.log("you presed Stop Edit Page, hopefully you hit the submit button if you wanted to save your changes")
        clearChildren(mainElement)
        document.querySelector(".container").append(displaySongView(album, song))
    });
    submitButton.addEventListener("click", ()=>{
        console.log("this is the submit button")
        //then send the info where it goes to update
    });


    return mainElement;
} 



export {editSongView}



/* <div class="pageButtons">
        <button class="button">Stop Edit</button>
    </div>
    <form>
        <div class="descriptionDiv">
            <div class="titleDiv">
                <h3 class="songTitle">Horchata</h3>
                <input type="text" placeholder="New song title" name="songTitle">
            </div>
            <div class="artistAlbumDiv">
                <h4 class="songArtist">by<span class="artist"> Vampire Weekend </span> on <span class="songAlbum"><a href="album.html">Contra</a></span></h4>
                <p>Note, these are atributes of the album</p>
            </div>
        </div>

        <div class="songDetails">
            <div class="songLengthDiv">
                <p class="songDurationLine">This song is <span id="songDuration">4m30s</span> long. </p>
                <!-- pattern="[0-9]+m[0-9]+s" -->
                <input type="text" placeholder="#m##s" name="songDuration">
            </div>
            <div>
                <p class="lyricsIntro">The lyrics acording to google are:</p>
                <pre><span class="songLyrics">lyrics lyrics lyrics 
lyrics lyrics lyrics lyrics 
lyrics lyrics lyrics lyrics v lyric 
lyrics lyrics lyrics lyrics 
lyrics lyrics lyrics 
lyrics 
lyrics lyrics 
lyrics lyrics lyrics </span></pre>
                <textarea name="songLyrics"></textarea>
            </div>
        </div>
        <input type="hidden" value="THE ID">
        <button type="submit" class="button ">Submit changes</button>
    </form> */