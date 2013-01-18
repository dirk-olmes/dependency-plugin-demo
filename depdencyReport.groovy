outputDirectory = new File(project.basedir, "target")
outputDirectory.mkdirs()

report = new File(outputDirectory, "dependencies.html")
writer = report.newWriter()

writer.write("<html><body><h1>Dependencies</h1>")
writer.write("<table border=1>")
writer.write("<tr>")
writer.write("<th>Key</th>")
writer.write("<th>Path</th>")
writer.write("</tr>")
project.properties.each {
    entry ->

    writer.write("<tr>")
    writer.write("<td>${entry.getKey()}</td>")
    writer.write("<td>${entry.getValue()}</td>")
    writer.write("</tr>")
}
writer.write("</table></body></html>")
writer.close()
