#!/bin/bash


cd ../helm

helm upgrade --install ${1} . -f values-${2}.yaml --namespace=core --set controller.admissionWebhooks.enabled=false
kubectl --namespace=core rollout restart deployment/${1}
##helm upgrade --install ${1} . -f values.yaml --namespace=sicab-poc-dev --set controller.admissionWebhooks.enabled=false
kubectl get pods -n core