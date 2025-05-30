package ch05.account.dto;

public class AccountDTO {
	// 필드
		private String ano; // 계좌번호
		private String owner; // 계좌주
		private int balance; // 잔고
		private String bankname; //은행명

		// 기본 생성자
		public AccountDTO() {
			// super();
			// AcountDTO accountDTO = new AccountDTO()
		}
		
		// 모든 필드를 사용한 생성자
		public AccountDTO(String ano, String owner, int balance, String bankname) {
			// super();
			// AcountDTO accountDTO = new AccountDTO(계좌번호, 계좌주, 금액, 은행명)
			this.ano = ano;
			this.owner = owner;
			this.balance = balance;
			this.bankname = bankname;
		}

		// 메서드 - 게터와 세터 메서드를 이용하여 활용한다.
		public String getAno() {
			// 계좌번호 출력시 변조를 담당
			return ano;
		}

		public String getOwner() {
			// 계좌주 출력시 변조를 담당
			return owner;
		}

		public int getBalance() {
			// 계좌 잔고를 출력시 변조를 담당
			return balance;
		}

		public String getBankname() {
			// 은행명 출력시 변조를 담당
			return bankname;
		}

		public void setAno(String ano) {
			// 계좌번호 입력시 검증 처리용
			this.ano = ano;
		}

		public void setOwner(String owner) {
			// 계좌주 입력시 검증 처리용
			this.owner = owner;
		}

		public void setBalance(int balance) {
			// 계좌 잔고 입력시 검증 처리용
			this.balance = balance;
		}

		public void setBankname(String bankname) {
			// 은행명 입력시 검증 처리용
			this.bankname = bankname;
		}

		@Override
		public String toString() {
			return "AccountDTO [ano=" + ano + ", owner=" + owner + ", balance=" + balance + ", bankname=" + bankname + "]";
		}

}
