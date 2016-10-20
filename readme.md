Example repo to reproduce problem posted at http://stackoverflow.com/questions/39967911/build-gradle-with-jacoco-plugin-doesnt-generate-coverage-report-for-integration

To reproduce, run

  gradle test integrationTest jacoco

Both tests run separately and successfully, however Jacoco only produces coverage for the non-integration tests.

Specifically, observe that in build/reports/ both test/ and integrationTest/ have an index.html file indicating test success, but jacoco/test/html/index.html is the only Jacoco file produced and it does not include coverage for the integrationTest which can be seen as successful at build/reports/integrationTest/index.html. The report also documents that standard output shows both tests were run.
