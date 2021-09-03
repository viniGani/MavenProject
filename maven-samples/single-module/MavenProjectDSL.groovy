job('First-Maven-Project-Via-DSL'){
    desciption("First Maven job generated by the SDL on ${new Data()}, the project is a small Maven project hosted on github")

    scm{
        git("https://github.com/viniGani/MavenProject.git", main)
    }
    triggers{
        scm("* * * * *")
    }
    steps{
        maven('clean package','maven-sample/single-module/pom.xml')
    }
    publisher{
        //archive war file generated
        archiveArtifacts '**/*.war'
    }
}