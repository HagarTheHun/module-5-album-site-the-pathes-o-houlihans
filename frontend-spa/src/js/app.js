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
 document.querySelector(".container").append(displayHomeView(allAlbumJson));
 document.querySelector(".container").append(createFooter());
// Noticed the footer floats up as we clear children

//console.log(allAlbumJson)