function getProduct() {

	var value = $(this).val();
	if (value != '') {
		var _token = $('input[name="_token"]').val();

		$.ajax({
			url: "{{ URL::to('/get-product') }}", // đường dẫn khi gửi dữ liệu đi 'search' là tên route mình đặt bạn mở route lên xem là hiểu nó là cái j.
			method: "POST", // phương thức gửi dữ liệu.
			data: {
				value: value,
				_token: _token
			},
			success: function(data) { //dữ liệu nhận về
				$('#val_price').val(data.price);
				$('#val_price_txt').val(formatNumber(new Number(data.price)));
				if (data.sale_price == null) {
					$('#val_sale_price').val(0);
					$('#val_sale_price_txt').val(formatNumber(0));
				} else {
					$('#val_sale_price').val(data.sale_price);
					$('#val_sale_price_txt').val(formatNumber(new Number(data.sale_price)));

				}
				getTotal();
			},
			error: function() {
				$('#val_price').val(null);
				$('#val_price_txt').val("Product Not found!!");
				$('#val_sale_price').val(null);
				$('#val_sale_price_txt').val("Product Not found!!");
				getTotal();
			}
		});
	}

};

function getTotal() {
	var price;
	if ($('#val_sale_price').val() > 0) {
		price = $('#val_sale_price').val();
	} else {
		price = $('#val_price').val()
	}

	var quantity = $('#val_quantity').val();
	var amount = formatNumber(price * quantity);
	$('#val_total').val(amount);
}
function formatNumber(num) {
	return num = num.toLocaleString('it-IT', { style: 'currency', currency: 'VND' });
}

$('#val_quantity').change(function() {
	getTotal();
});