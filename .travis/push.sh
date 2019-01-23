#!/usr/bin/env bash

setup_git() {
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "Travis CI"
}

commit_website_files() {
  git checkout -b master
  git add .
  git commit --message "docs(travis): Commit via Travis CI - Build: ${TRAVIS_BUILD_NUMBER}"
}

push() {
  git remote add origin https://${GH_TOKEN}@github.com/cchacin/MicroGen.git > /dev/null 2>&1
  git push --quiet --set-upstream origin master 
}

setup_git
commit_website_files
push