<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<h2><xsl:value-of select = "StudentScores/College"/></h2>
				<table border="1">
					<tr bgcolor="#000000">
						<th>ID</th>
						<th>FirstName</th>
						<th>LastName</th>
						<th>Score</th>
					</tr>
					<xsl:for-each select = "StudentScores/Student">
						<xsl:sort select="@id" data-type="number"/>
						<tr>
							<td><xsl:value-of select = "@id"/></td>
							<td><xsl:value-of select = "FirstName"/></td>
							<td><xsl:value-of select = "LastName"/></td>
							<td><xsl:value-of select = "Score"/></td>
							<td>
								<xsl:choose>
									<xsl:when test="Score>=90">A</xsl:when>
									<xsl:when test="Score>=80">B</xsl:when>
									<xsl:when test="Score>=70">C</xsl:when>
								</xsl:choose>
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>