
async function loadPosts(){

const container = document.getElementById("postContainer")

const response = await fetch("http://localhost:8080/posts")

const posts = await response.json()

posts.forEach(post => {

const div = document.createElement("div")

div.className="post"

div.innerHTML = `
<h3>${post.title}</h3>
<p>${post.content}</p>
`

container.appendChild(div)

})

}

loadPosts()