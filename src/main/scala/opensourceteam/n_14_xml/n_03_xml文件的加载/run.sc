import java.io.FileInputStream

import scala.xml.XML

val books = XML.loadFile("e:\\temp\\a\\a.xml")


val books2 = XML.load(new FileInputStream("e:\\temp\\a\\a.xml"))


val books3 = XML.load(new FileInputStream("e:\\temp\\a\\a.xml"))


XML.save("e:\\temp\\a\\b.xml",books3)