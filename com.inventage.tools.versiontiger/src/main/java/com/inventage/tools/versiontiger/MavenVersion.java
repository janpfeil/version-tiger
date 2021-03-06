package com.inventage.tools.versiontiger;

public interface MavenVersion extends Version {

	String suffix();
	
	MavenVersion incrementMajorAndSnapshot();

	MavenVersion incrementMinorAndSnapshot();

	MavenVersion incrementBugfixAndSnapshot();

	MavenVersion releaseVersion();

	MavenVersion snapshotVersion();

}
