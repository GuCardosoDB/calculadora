function somar(){
    var num1 = Number(document.getElementById('txtn1').value);
    var num2 = parseInt(document.getElementById('txtn2').value);
    var total = num1 + num2;
    document.getElementById ('res1').innerHTML = 'Resultado:' + total;

    console.log('SOMANDO VALORES!');
}

function subtrair(){
    var num3 = Number(document.getElementById('num1s').value);
    var num4 = parseInt(document.getElementById('num2s').value);
    var total = num3 - num4;
    document.getElementById ('res2').innerHTML = 'Resultado:' + total;

    console.log('SUBTRAIR VALORES!');
}

function multiplicar(){
    var num5 = Number(document.getElementById('num1m').value);
    var num6 = parseInt(document.getElementById('num2m').value);
    var total = num5 * num6;
    document.getElementById ('res3').innerHTML = 'Resultado:' + total;

    console.log('MULTIPLICAR VALORES!');
}

function dividir(){
    var num5 = Number(document.getElementById('num1d').value);
    var num6 = parseInt(document.getElementById('num2d').value);
    var total = num5 / num6;
    document.getElementById ('res4').innerHTML = 'Resultado:' + total;

    console.log('DIVIDIR VALORES!');
}
