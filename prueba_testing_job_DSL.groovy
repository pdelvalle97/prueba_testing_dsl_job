project_name = "test_jenkins_DSL_prueba"
repo = "git@github.com:pdelvalle97/prueba_testing_dsl_job.git"
repo_name = "repo_prueba"

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
