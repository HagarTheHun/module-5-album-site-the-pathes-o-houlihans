import {
    createHeader
} from "./Header.js"
import {
    createFooter
} from "./Footer.js"
import {
    displayHomeView
} from "./displayHomeView.js"
import { allAlbumJson } 
from "./sampleAllAlbums.js";

import {
    displayAlbumView
} from "./displayAlbumView.js"
import {
    displaySongView
} from "./displaySongView.js"

 document.querySelector(".container").prepend(createHeader());
//  document.querySelector(".container").append(displayHomeView(allAlbumJson));
fetch("http://localhost:8080/api/albums", {
    method: 'GET',
    //mode: 'no-cors'
})
.then(response => response.json())
.then(albums => displayHomeView(albums))
.then(mainElement => document.querySelector(".container").append(mainElement))
.catch(ERROR => console.log(ERROR)); 
 document.querySelector(".container").append(createFooter());
//console.log(allAlbumJson)