window.onload = function() {
	var file1 = document.getElementById("button1");
	var file2 = document.getElementById("button2");
	var file3 = document.getElementById("button3");
	var content = document.getElementById("content");
	var date = document.getElementById("timecontainer");
	file1.onclick = function() {
		content.innerHTML = "<embed src='C:/Users/Wen/Desktop/PROJECT/files/project1.pdf' height='500vh' width='1000vh'>";
	}

	file2.onclick = function() {
		content.innerHTML = "<embed src='C:/Users/Wen/Desktop/PROJECT/files/project2.pdf' height='500vh' width='1000vh'>";
	}

	file3.onclick = function() {
		content.innerHTML = "<embed src='C:/Users/Wen/Desktop/PROJECT/files/project3.pdf' height='500vh' width='1000vh'>";
	}
}
