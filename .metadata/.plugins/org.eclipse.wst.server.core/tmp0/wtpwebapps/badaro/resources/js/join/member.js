//모든 공백 체크 정규식 
var empJ = /\s/g; 
//아이디 정규식 
var idJ = /^[a-z0-9][a-z0-9_\-]{4,19}$/; 
// 비밀번호 정규식 
var pwJ = /^[A-Za-z0-9]{4,12}$/; 
// 이름 정규식
var nameJ = /^[가-힣]{2,4}|[a-zA-Z]{2,10}\s[a-zA-Z]{2,10}$/; 
// 휴대폰 번호 정규식
var phoneJ = /^01([0|1|6|7|8|9]?)?([0-9]{3,4})?([0-9]{4})$/; 

/^[가-힣]{2,4}|[a-zA-Z]{2,10}\s[a-zA-Z]{2,10}$/

var birthJ = false;

$(document).ready(function() {
	
	//아이디 중복확인
	$("id").blur(function() {
		if($('id').val()=='') {
			$('#id_check').text('아이디를 입력하세요.');
			$('#id_check').css('color', 'red');	
		} else if (idJ.test($('#id').val())!=true){
			$('#id_check').text('4~12자의 영문, 숫자만 사용 가능합니다.');
			$('#id_check').css('color', 'red');	
		}
	}); // blur 끝
	
	$('form').on('submit',function() {
		var inval_Arr = new Array(5).fill(false);
		if (idJ.test($('#id').val())) {
			inval_Arr[0] = true;
		} else {
			inval_Arr[0] = false; 
			alert('아이디를 확인하세요.'); 
			return false;
		}
		
		// 비밀번호가 같은 경우 && 비밀번호 정규식
		if (($('#pw').val() == ($('#pw2').val())) && pwJ.test($('#pw').val())) {
			inval_Arr[1] = true;
		} else {
			inval_Arr[1] = false; 
			alert('비밀번호를 확인하세요.');
			return false;
		}
		
		// 이름 정규식
		if (nameJ.test($('#name').val())){
			inval_Arr[2] = true;
		} else {
			inval_Arr[2] = false; 
			alert('이름을 확인하세요.'); 
			return false;
		}
		
		// 생년월일 정규식
		if (birthJ) {
			console.log(birthJ); 
			inval_Arr[3] = true;
		} else {
			inval_Arr[3] = false; 
			alert('생년월일을 확인하세요.'); 
			return false;
		}
		
		 // 휴대폰번호 정규식
		if (phoneJ.test($('#phone').val())) {
			console.log(phoneJ.test($('#phone').val()));
			inval_Arr[4] = true;
		} else {
			inval_Arr[4] = false; 
			alert('휴대폰 번호를 확인하세요.'); 
			return false;
		}
		
		if(validAll == true){ // 유효성 모두 통과
			alert('바다로 가족이 되어주셔 감사합니다.');
		} else {
			alert('정보를 다시 확인하세요.');
		}	
	}); // submit 끝
	
	$('#id').blur(function(){
		if (idJ.test($('#id').val())) {
			console.log('true'); 
			$('#id_check').text('');
		}  else {
			console.log('false'); 
			$('#id_check').text('5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.'); 
			$('#id_check').css('color', 'red');
		}
	});
	
	$('#pw').blur(function() { 
		if (pwJ.test($('#pw').val())) { 
			console.log('true'); 
			$('#pw_check').text(''); 
			} else { 
				console.log('false'); 
				$('#pw_check').text('4~12자의 숫자 , 문자로만 사용 가능합니다.'); 
				$('#pw_check').css('color', 'red'); 
			} 
	});
	
	//1~2 패스워드 일치 확인 
	$('#pw2').blur(function() { 
		if ($('#pw').val() != $(this).val()) { 
			$('#pw2_check').text('비밀번호가 일치하지 않습니다.'); 
			$('#pw2_check').css('color', 'red'); 
			} else { 
				$('#pw2_check').text(''); 
				} 
	});
	
	//이름에 특수문자 들어가지 않도록 설정
	$("#name").blur(function() {
		if (nameJ.test($(this).val())) {
			console.log(nameJ.test($(this).val())); 
			$("#name_check").text('');
		} else {
			$('#name_check').text('한글 2~4자 이내로 입력하세요. (특수기호, 공백 사용 불가)');
			$('#name_check').css('color', 'red');
		}
	});

	
	// 생일 유효성 검사 
	var birthJ = false;
	$('#birth').blur(function() {
		var dateStr = $(this).val(); 
		var year = Number(dateStr.substr(0,4)); // 입력한 값의 0~4자리까지 (연)
		var month = Number(dateStr.substr(4,2)); // 입력한 값의 4번째 자리부터 2자리 숫자 (월)
		var day = Number(dateStr.substr(6,2)); // 입력한 값 6번째 자리부터 2자리 숫자 (일)
		var today = new Date(); // 날짜 변수 선언
		var yearNow = today.getFullYear(); // 올해 연도 가져옴
		
		if (dateStr.length <=8) {
			// 연도의 경우 1900 보다 작거나 yearNow 보다 크다면 false를 반환합니다.
			if (year > yearNow || year < 1900 ) {
				$('#birth_check').text('생년월일을 확인해주세요'); 
				$('#birth_check').css('color', 'red');
			} else if (month < 1 || month > 12) {
				$('#birth_check').text('생년월일을 확인해주세요 '); 
				$('#birth_check').css('color', 'red');
			} else if (day < 1 || day > 31) {
				$('#birth_check').text('생년월일을 확인해주세요 '); 
				$('#birth_check').css('color', 'red');
			} else if ((month==4 || month==6 || month==9 || month==11) && day==31) {
				$('#birth_check').text('생년월일을 확인해주세요 ');
				$('#birth_check').css('color', 'red');
			} else if (month == 2) {
				var isleap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
				if (day>29 || (day==29 && !isleap)) {
					$('#birth_check').text('생년월일을 확인해주세요 '); 
					$('#birth_check').css('color', 'red');
				} else {
					$('#birth_check').text(''); 
					birthJ = true;
				}
			} else {
				$('#birth_check').text(''); 
				birthJ = true;
			}			
		} else {
			//1.입력된 생년월일이 8자 초과할때 : auth:false 
			$('#birth_check').text('생년월일을 확인해주세요 '); 
			$('#birth_check').css('color', 'red');
		}
	});
	
	// 휴대전화
	$('#phone').blur(function() {
		if(phoneJ.test($(this).val())) {
			console.log(nameJ.test($(this).val()));
			 $("#phone_check").text('');
		} else {
			$('#phone_check').text('휴대폰번호를 확인해주세요 '); 
			$('#phone_check').css('color', 'red');
		}

	});


	

			
	
	
}); // 전체 끝
		