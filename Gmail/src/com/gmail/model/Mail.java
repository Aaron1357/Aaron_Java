package com.gmail.model;

public class Mail {

	private String mailIndex;
	private String mailnote;

	public Mail() {
	}

	public Mail(String mailIndex, String mailnote) {

		this.mailIndex = mailIndex;
		this.mailnote = mailnote;
	}

	public String getMailIndex() {
		return mailIndex;
	}

	public void setMailIndex(String mailIndex) {
		this.mailIndex = mailIndex;
	}

	public String getMailnote() {
		return mailnote;
	}

	public void setMailnote(String mailnote) {
		this.mailnote = mailnote;
	}

}
