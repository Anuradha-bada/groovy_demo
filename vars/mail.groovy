 def call(String buildresult)
 {
      if(buildresult=='success')
      {
      mail to: 'anusriianureddy@gmail.com',
      subject: "Job status: ${currentBuild.fullDisplayName}",
      body: "your job got $currentBuild.result"
      }
      else{
      mail to: 'anusriianureddy@gmail.com',
      subject: "Job status: ${currentBuild.fullDisplayName}",
      body: "your job got $currentBuild.result"
      }
}
