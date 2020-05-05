project_name = "jjjj"
repo = "ssss"
repo_name = "sddddd"

pipelineJob(project_name){
	definition{
		triggers{
		    scm('H/1****')	
		}
		cpsScm{
		    scm{
			git{
			   remote{
			      name(repo_name) 
			      url(repo)	
			   }
			}
			scriptPath("Jenkinsfile")
		    }
		}
	}
}
