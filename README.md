# X-definition

X-definition is registered technology of the firm Syntea software group a.s.,
for professional work with XML documents.

For the purpose of describing the structure of XML documents, their validation,
processing and creation, this tool was developed by Syntea Software Group Inc.
It allows the user to not only define the structure of XML documents,
but also to describe specifically their processing and construction.

Homepage: <http://www.xdef.org>

# License
The source code for this project is licensed under
[Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0).



# Examples

Ex1: simple sequence of elements
...

Ex2: choice
...

Ex3: repeating
...

Ex4: xd-script
...



# Building

Prerequisities:
* download project X-definition, for example from GitHub: <https://github.com/Syntea/xdef>
* install _java_
* install _maven_
* configure _maven_
    * configure maven-plugin _toolchain_

Frequent building operations:
* cleaning before any building and deploying:
  ```shell
  mvn clean
  ```
* build snapshot package:
  ```shell
  mvn package
  ```
* build release packages including javadoc, sources, documentation:
  ```shell
  mvn package -Prelease,javadoc,sources
  ```



# Deploying to maven central repository

Prerequisities:
* prerequisities for building
* install the pgp-managing software GnuPG (<https://gnupg.org/>)
* configure _maven_:
    * access to pgp-key
    * access to maven repository _oss.sonatype.org_ (having id "_ossrh_")

Deploying to maven central repository:
* deploy release packages including javadoc, sources, documentation:
  ```shell
  mvn deploy -Prelease,javadoc,sources,dm-ossrh
  ```
