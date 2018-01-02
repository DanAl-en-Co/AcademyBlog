package com.alessio.danny;

import com.alessio.danny.service.EntryService;
import com.alessio.danny.service.impl.EntryServiceImpl;

public class app {

	public static void main(String[] args) {
		EntryService ed = new EntryServiceImpl();
		
		ed.insertEntry("Alessio", "Hallo dit is een test");
		
		System.out.println(ed.getGuestBookEntries().toString());

	}

}
