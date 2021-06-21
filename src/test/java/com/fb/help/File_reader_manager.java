package com.fb.help;

public class File_reader_manager {
	private File_reader_manager() {}
	public static File_reader_manager getinstance() {
		File_reader_manager manager=new File_reader_manager();
		return manager;

	}
	public configuration_reader getinstanacecr() throws Throwable {
		configuration_reader reader=new configuration_reader();
		return reader;

	}

}
