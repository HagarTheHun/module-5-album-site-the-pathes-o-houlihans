import {
    createHeader
} from "./Header.js"
import {
    createFooter
} from "./Footer.js"
import {
    displayHomeView
} from "./displayHomeView.js"
import { allAlbumJson } from "./sampleAllAlbums.js";
document.querySelector(".container").prepend(createHeader());
document.querySelector(".container").append(displayHomeView(allAlbumJson));
document.querySelector(".container").append(createFooter());
