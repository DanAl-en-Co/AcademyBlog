package com.alessio.danny.service.impl;

import java.util.Collection;

import com.alessio.danny.dao.EntryDao;
import com.alessio.danny.dao.impl.EntryDaoImpl;
import com.alessio.danny.model.GuestBookEntry;
import com.alessio.danny.service.EntryService;

public class EntryServiceImpl implements EntryService {
	
	EntryDao entryDao = new EntryDaoImpl();
	
	@Override
	public Collection<GuestBookEntry> getGuestBookEntries() {
		return entryDao.getGuestBookEntries();
	}

	@Override
	public void insertEntry(String userName, String message) {
		entryDao.insertEntry(userName, message);
		
	}

}
