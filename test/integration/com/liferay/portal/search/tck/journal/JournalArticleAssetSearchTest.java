package com.liferay.portal.search.tck.journal;

import org.arquillian.liferay.deploymentscenario.annotations.BndFile;

import com.liferay.portal.search.tck.bnd.BndConstants;

@BndFile(
		BndConstants.BASE_DIR 
		+ "/com/liferay/portal/search/tck/journal"
		+ "/bnd.bnd")
public class JournalArticleAssetSearchTest 
	extends com.liferay.journal.asset.test.JournalArticleAssetSearchTest {

}