<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
<title>Insert title here</title>
<style type="text/css">
body {
	margin: 0px;
	padding: 0px;
}
/*顶部内容*/
.top {
	width: 100%;
	height: 40px;
	background-color: rgb(0, 60, 115);
}

.top>form {
	float: right;
}

.top>p {
	float: right;
	margin-left: 10 px;
}

.top>form {
	margin-top: 5px;
	margin-right: 5px;
}

.top>p {
	color: white;
	line-height: 10px;
}
/*顶部布局结束 */
/*正文内容开始*/
.main {
	width: 100%;
	height: 700px;
	border: 1px solid black;
}

.main-left {
	float: left;
	height: 99%;
	width: 50%;
	border: 1px solid black;
}

.main-left-head {
	width: 100%;
	height: 40px;
	background-color: rgb(163, 211, 243);
	padding-top: -10px;
}

.main-left-head>p {
	text-align: center;
	margin-top: -1px;
	line-height: 40px;
	font-family: "黑体";
	font-size: 19px;
}

.main-right {
	float: left;
	height: 99%;
	width: 49%;
	border: 1px solid black;
}

.same-span {
	border-bottom : 1px solid black;
	width : 40px ;
}

</style>
</head>
<body>
	<c:forEach items="${userAccountInfo.userAccounts}" var="item">
		<!--  顶部划分-->
		<div class="top">
			<form action="logout">
				<table>
					<tr>
						<td><input type="submit" value="注销" /></td>
					</tr>
				</table>
			</form>
			<p>用户名：${userAccountInfo.userName}&nbsp&nbsp</p>
		</div>

		<!--正文内容开始-->
		<div class="main">
			<div class="main-left">
				<div class="main-left-head">
					<p>买&nbsp&nbsp入</p>
				</div>
				<form action="">
					<!-- 1 -->
					*账户名称：<input type="text" value="${item.accountName}" /> 清算速度：<input
						type="radio" name="sex" value="male" checked="checked" />T+0 <input
						type="radio" name="sex" value="women" />T+1 <br />
					<!-- 2 -->
					*债券代码：<input type="text" onmouseout="getSecuBond(value)"  id="zqdm"/>
				<!-- 	<span id="zqjc">123</span> -->
					 结算日：<input
						type="text" / id="jsr"> <br />
					<!-- 3-->
					*投资类型：<select>
						<option>上海</option>
						<option>广州</option>
					</select> 登记机构：<input type="text" id="djjg" /> <br />
					<!-- 4-->
					净价价格：<input type="text" />净价金额：<input type="text" /> <br />
					<!-- 5 -->
					全价价格：<input type="text" />全价金额：<input type="text" /> <br />
					<!-- 6-->
					应计利息：<input type="text" id="yjlx"/>利息总额：<input type="text" /> <br />
					<!-- 7-->
					*券面总额：<input type="text" id="qmze"/>交易对手：<input type="text" /> <br />
					<!-- 8-->
					到期收益率：<input type="text" />对手交易员：<select>
						<option>上海</option>
						<option>广州</option>
					</select> <br /> <input type="submit" value="债券买入" />
				</form>
			</div>
			<div class="main-right">
				<fieldset>
					<legend>资产信息</legend>
					<span>T0可用余额：</span><span class="same-span">${item.tMoney }</span>
					&nbsp&nbsp&nbsp&nbsp <span>T1可用余额：</span><span class="same-span">${item.t1Money}</span>
					<br /> <span>现金 金额：</span><span class="same-span">${item.cashMoney }</span>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <span>可买券面总额：</span><span
						class="same-span">${item.faceMoney }</span>
				</fieldset>
				<fieldset>
					<legend>债券信息</legend>
					<span >票面利率：</span><span id="span1" class="same-span"></span>元
					&nbsp&nbsp&nbsp&nbsp 
					<span >中债估值：</span><span id="span2" class="same-span"></span>元
					<br />
					 <span>债券评级：</span><span class="same-span" id="span3"></span>元
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 
					<span>主体评级：</span><span class="same-span" id="span4"></span>元
				</fieldset>
				<fieldset>
					<legend>持仓信息</legend>
					<table border="1px">
						<tr>
							<th>债券代码</th>
							<th>债券简称</th>
							<th>持仓数量</th>
							<th>质押数量</th>
							<th>中债估值净价</th>
						</tr>
						<tr>
							<td>010011</td>
							<td>01国开14</td>
							<td>11,000.00</td>
							<td>10000.0</td>
							<td>113.12</td>
						</tr>
						<tr>
							<td>010011</td>
							<td>01国开14</td>
							<td>11,000.00</td>
							<td>10000.0</td>
							<td>113.12</td>
						</tr>
						<tr>
							<td>010011</td>
							<td>01国开14</td>
							<td>11,000.00</td>
							<td>10000.0</td>
							<td>113.12</td>
						</tr>
						<tr>
							<td>010011</td>
							<td>01国开14</td>
							<td>11,000.00</td>
							<td>10000.0</td>
							<td>113.12</td>
						</tr>
					</table>
				</fieldset>
			</div>
		</div>
	</c:forEach>
	<%-- 	<c:forEach items="${userAccountInfo.userAccounts}" var="item">
        ${item.accountName}	
	</c:forEach> --%>
</body>
<script type="text/javascript">
	/* data:表示债券代码 */
	function getSecuBond(data) {
		$.ajax({
			type : 'post',
			dataType : 'json',
			url : 'http://localhost:8080/transport-bank-find/user/getUAS/'
					+ data,
			success : function(result) {
				/* alert('成功'); */
				//console.log(result);
				//alert(result.code);
				$("#jsr").val(result.data.getuas.closeDay);
				$("#djjg").val(result.data.getuas.registerOrg);
				$("#span1").html(result.data.getuas.faceRate);
				$("#span2").html(result.data.getuas.assessment);
				$("#span3").html(result.data.getuas.secuGrade);
				$("#span4").html(result.data.getuas.mainGrade);
				$("#yjlx").val(result.data.getuas.interest+"   "+"元/百元面值");
				$("#qmze").val("100.00万元");
			}
		});

		// 结算日
		//$('#jsr').val()
		// 登记机构

	}
</script>
</html>