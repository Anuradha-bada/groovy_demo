 def call(String buildresult)
 {
      if(buildresult=='SUCCESS')
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
