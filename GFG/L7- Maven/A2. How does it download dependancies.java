when you add dependancies in pom.xml it downloads dependancies from central repository - repo.maven.apache.org/maven2 : this is your central repository. maven downloads dependancies from this.

You dont need to download these dependancies again once they are downloaded they are stored in you local repository.

There are 3 types of repository

  1. Central Repository: Public Repo, Accessible to add, open source code bases are here. available on the internet and no authentication is required to access them
  2. Local Repo: Local repo when all you jar files are stored.
  3. Remote Repo: private repository, they are present on internet but they have some authentication to access them.


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

Q. How does maven scan the pom.xml? How does maven know whether to scan from central repo or local repository.
  : pox.xml will run and then it'll check if those dependencies are present in local repository or not. if they are present then process will stop for one dependency. If not present then it'll check in remote repository.
  and its present in remote repo, it adds it to local repo for using next time and stops. 
   and if its not present in remote repo it goes to central repo. Then it adds that dependancy in remote repository and stops it. and if its not present in central repo too it'll throw an error that dependancy is not present.

Q. If dependancies for one project are already downloaded will it download again for another prject?
  : if local repository is same for all projects, it'll already have the jar files so why will it download the dependancies again.
     p1 -> ~/.m2
     p2 -> ~/.m2
     p3 -> ~/.m2 
  the local repo of these 3 projects are same. if required jar files are already downloaded previously it wont download them again.
  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  Snapashot Version: The project which are in progress are called as snapshot.
  1.1 (kind of versions): Project is in stable state.

  :if spring boot project has version 3.5.1-snapshot I shouldnt use this, this project might have some bugs/issues. i should use 3.4.0 kind of version.
  : snapshot generally refers to the current project version we are working on.
  :2.4- snapshot is version we're working on, after development it'll become 2.4 which is stable version.
