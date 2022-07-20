import circlet.pipelines.script.put

job("My project warmup data for Gateway") {
     

    warmup(ide = Ide.Idea) {
        // path to the warm-up script
        scriptLocation = "./dev-env-warmup.sh"
    }
}

job("mv files with script") {
    container(displayName = "copy java7", image = "alpine/curl") {
        shellScript {
           content = "curl -f -L -H 'Authorization: Bearer eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiIyVVhXYUUzb1JyY0siLCJhdWQiOiJjaXJjbGV0LXdlYi11aSIsIm9yZ0RvbWFpbiI6InRhbGVudHBsdXMiLCJuYW1lIjoiYnBheHRvbiIsImlzcyI6Imh0dHBzOlwvXC90YWxlbnRwbHVzLmpldGJyYWlucy5zcGFjZSIsInBlcm1fdG9rZW4iOiI0ZjFRUU8zY0Mxb24iLCJwcmluY2lwYWxfdHlwZSI6IlVTRVIiLCJpYXQiOjE2NTE2MDM0NDV9.NbsswPzYboCDpV8zNf_hhbBIK-cXz-KamycWdbPEuMdfpT_MzDhMbt9avih1D7WKzBpzc91m_7xhlunbpdqPUGV_8_urqLtcu1h229UUdguk5TgDxWhgg_bwuF3iCAYJplHOldLFD5-7dhokIFLfnmnRy4fqn5tB1_eVXcVZBcU' -o /usr/lib/jvm 'https://files.pkg.jetbrains.space/talentplus/p/tb-6/jdk7/7.0.232-zulu.zip' "
        }
    }
}

//job("get and set files with kotlin") {
//    println("copy some file jerk")
//     container(displayName = "get me some files", image = "openjdk:11") {
//    kotlinScript { api ->
//        val zipFile = api.space().projects.packages.repositories.getRepository(
//                project = ProjectIdentifier.Id("2wptuF3FwVPr"),
//                repository = PackageRepositoryIdentifier.Id("7IYA50uoTOx")
//        )
//
//    println("hello" + zipFile.toString() )
//
//        //add file somehow to share
//        api.fileShare()
//    }
//    }
//}
