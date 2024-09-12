package com.audintel.project.service;

import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ControllerService {

	public List<String> getAnagrams(String str) {
		String[] strl = str.split("");
		List<String> anagramList = new ArrayList<>();
		String rotateStr = str;
		for (int i=0;i<str.length();i++) {
			for (int z = 0;z<rotateStr.length();z++) {
				String rostr = rotateStr.substring(z);
				String studyStr = rotateStr.substring(0, z);
				String ro = rostr;
				for (int j = 0; j < rostr.length(); j++) {
					if (!anagramList.contains(studyStr + ro)) {
						anagramList.add(studyStr + ro);
					}
					if (ro.length() > 1) {
						ro = "" + ro.charAt(ro.length() - 1) + ro.charAt(0) + ro.substring(1, ro.length() - 1);
						System.out.println("ro String : "+ro);
					}
				}

			}
			rotateStr = "" + rotateStr.charAt(rotateStr.length() - 1) + rotateStr.charAt(0) + rotateStr.substring(1, rotateStr.length() - 1);
			System.out.println(" rotated String : "+rotateStr);
		}

		return anagramList;
	}
	
}
