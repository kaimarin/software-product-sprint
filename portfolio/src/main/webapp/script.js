// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function getShows() {
  const showsContainer = document.getElementById('shows-container');
  showsContainer.replaceChildren();
  const imgs = ["images/IMG-9491.jpg", "images/IMG-9492.jpg", "images/IMG-9493.jpg",
                "images/IMG-9494.jpg"];
  const office = "A show I can watch over and over and it's hilarious every time";
  const bb = "Breaking Bad: Crazy storytelling, will have you on the edge of your seat the whole way through";
  const op = "An adventure story that is hilarious and inspiring";
  const btc = "Prequel to Breaking Bad, really well written and acted.  Can't wait for season 6.";
  const pars = [office, bb, op, btc];

  // Pick a random image which features quotes from my favorite TV shows and movies.
  const index = Math.floor(Math.random() * imgs.length);
  const src = imgs[index];
  const p = pars[index];

  // Add it to the page.
  let image = document.createElement("img");
  image.src = src;
  let par = document.createElement("p");
  par.textContent = p;

  showsContainer.appendChild(image);
  showsContainer.appendChild(par);
}

/**
 * Removes the children of given parent
 */
function removeChildren(parent) {
  while (parent.firstChild) {
    parent.removeChild(parent.firstChild);
  }
}

/**
 * Makes a request to server and retrieves message
 */
async function getMessage() {
    const container = document.getElementById("server-req");
    container.replaceChildren();    
    const srvrResp = await fetch("/hello");
    const json = await srvrResp.json();
    console.log(json);
    const index = Math.floor(Math.random() * json.length);
    const p = document.createElement("p");
    p.textContent = json[index];
    container.appendChild(p);
}
