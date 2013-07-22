package org.emunoz.xml.crawler;

import java.io.File;
import java.io.IOException;

import org.xml.sax.InputSource;

import jlibs.xml.sax.crawl.XMLCrawler;

public class CrawlerXML
{

	public static void main(String[] args)
	{
		String dir = "./schemas"; // directory where to save crawled documents
		//String wsdl = "https://fps.amazonaws.com/doc/2007-01-08/AmazonFPS.wsdl"; // wsdl to be crawled
		//String wsdl = "http://docs.jboss.org/cdi/beans_1_0.xsd";
		String wsdl = "http://131.107.72.15/SoapWsdl_BaseDataTypes_XmlFormatter_Service_Indigo/BaseDataTypesDocLitB.svc?wsdl";

		try
		{
			new XMLCrawler().crawlInto(new InputSource(wsdl), new File(dir));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		System.err.println("Crawl Finished");
	}
}
