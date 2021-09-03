job('First-Maven-Project-Via-DSL'){
    description("First Maven job generated by the SDL on ${new Date()}, the project is a small Maven project hosted on github")

    scm {
        git("https://github.com/viniGani/MavenProject.git", /master)
    }
    triggers{
        scm("* * * * *")
    }
    steps{
        maven('clean package','maven-samples/single-module/pom.xml')
    }
    publisher{
        //archive war file generated
        archiveArtifacts '**/*.war'
    }
}
