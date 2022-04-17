
function updateCart(userId, productId) {
	const value = document.getElementById("val-" + productId).value;
	const isSelected = document.getElementById("select-" + productId).checked;
	console.log("valIsChange: value =" + value + " isSelected= " + isSelected);

	var data = {}
	data["val"] = value;
	data["isSelected"] = isSelected;
	data["userId"] = userId;
	data["productId"] = productId;

	$.ajax({
		url: "api/update-cart",
		data: data,
		timeout: 100000,
		success: function(data) {
			let vndFormat = Intl.NumberFormat('en-VI');
			let arr = data.split('%');
			if (arr[1] == "null") {
				document.getElementById("price-" + productId).innerHTML = vndFormat.format(arr[0]) + " VND"
			} else {
				document.getElementById("price-" + productId).innerHTML = "<del>" + vndFormat.format(arr[0]) + " VND" + "</del> " + arr[2] + "%";
				document.getElementById("sale-" + productId).innerHTML = vndFormat.format(arr[1]) + " VND";
			}
			console.log("Status: ", arr);
			const card = document.getElementById("card-" + productId);
			if (isSelected) {
				card.style.backgroundColor = "#393966"
			} else {
				card.style.backgroundColor = "#343444"
			}
			cartCaculate(userId);
		},
	});
}

function cartCaculate(userId) {

	var data = {}
	data["userId"] = userId;
	$.ajax({
		url: "api/cart-caculate",
		data: data,
		timeout: 100000,
		success: function(data) {
			let vndFormat = Intl.NumberFormat('en-VI');

			const arr = data.split('%');
			document.getElementById("price").innerHTML = vndFormat.format(arr[0]) + " VND";
			document.getElementById("delivery").innerHTML = vndFormat.format(arr[1]) + " VND";
			document.getElementById("total").innerHTML = vndFormat.format(arr[2]) + " VND";
			console.log(data);
		},
	});
}

function deleteCart(userId, productId) {

	var data = {}
	data["userId"] = userId;
	data["productId"] = productId;
	$.ajax({
		url: "api/delete-cart",
		data: data,
		timeout: 100000,
		success: function(data) {
			console.log("status:" + data);
			const card = document.getElementById("card-" + productId);
			card.parentNode.removeChild(card);
		},
	});
}

function addCart(productId) {

	let user_id = document.getElementById("user_id").value;
	if (user_id) {
		var data = {}
		data["userId"] = user_id;
		data["productId"] = productId;
		$.ajax({
			url: "/iMusical_SpringMVC/api/add-cart",
			data: data,
			timeout: 100000,
			success: function(data) {
				console.log("status:" + data);
			},
		});
	}else{
		window.location.replace("http://stackoverflow.com");
	}


}

cartCaculate((document.getElementsByName("user_id"))[0].value);
