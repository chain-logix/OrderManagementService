package com.chain.oms.utility;

import java.util.regex.Pattern;

public class OmsReusableFunctionsUtility {
	
	
	public static StringBuilder replaceAllStrings(StringBuilder input,String oldStringToReplace,String newStringToInsert)
	{
			if(null!=input)
			{
				Integer oldStringIndex = input.indexOf(oldStringToReplace);
				Integer repeatIndexOldString=-1;
				while(oldStringIndex>0)
				{
					if(oldStringIndex>=repeatIndexOldString)
					{
						input.replace(oldStringIndex,oldStringIndex+oldStringToReplace.length(),newStringToInsert);
						repeatIndexOldString=oldStringIndex+newStringToInsert.length();
						oldStringIndex=input.indexOf(oldStringToReplace);
					}
				}
			}
			return input;
	}

	
	public static Boolean validateEmailId(String mailId)
	{

		final Pattern mailIdPattern =Pattern.compile("[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}",Pattern.CASE_INSENSITIVE);
		
		return mailIdPattern.matcher(mailId).matches();
	}
	
}
