package com.gmail.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import com.gmail.model.Mail;

public class MailController {

    private HashMap<String, Mail> mailMap = new HashMap<>();

    public String myMail(String who, Mail mail) {
        mailMap.put(who, mail);
        return who + "님에게 메일을 발송하였습니다";
    }

    public String totalMail() {
        String temp = "";
        Set<String> key = mailMap.keySet();

        for (String string : key) {
            temp += "받는 사람: " + string + " 메일 제목: " + mailMap.get(string).getMailIndex() + " 메일 내용: "
                    + mailMap.get(string).getMailnote() + "\n";
        }

        return temp;
    }
    public String deleteMail(String who) {
		 
		mailMap.remove(who);
		

	return "메일 함이 삭제되었습니다.";
}
}
